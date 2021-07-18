package livestudy;

import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.kohsuke.github.GHIssue;
import org.kohsuke.github.GHIssueComment;
import org.kohsuke.github.GHIssueState;
import org.kohsuke.github.GHRepository;
import org.kohsuke.github.GitHub;
import org.kohsuke.github.GitHubBuilder;

public class LiveStudyApplication {
	
	public static void main(String[] args) {
		try {
			run();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	private static void run() throws IOException {
		//create github connection
		GitHub github = new GitHubBuilder().withOAuthToken(SecurityInfo.oauthToken).build();
		github.checkApiUrlValidity();
		System.out.println("gitHub connection OK");
		
		GHRepository ghRepository = github.getRepository(SecurityInfo.targetRepository);
		Set<String> participant = new HashSet();
		List<GHIssue> issues = ghRepository.getIssues(GHIssueState.ALL);
		
		//issue 참가자의 이름을 알 수 있다.
		for(GHIssue issue : issues) {
			List<GHIssueComment> commentList = issue.getComments();
			
			for(GHIssueComment comment : commentList) {
				participant.add(comment.getUser().getName());
			}
		}
	}
}
