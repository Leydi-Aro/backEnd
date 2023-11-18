package com.example.rentstate.forums.api.resource.forumQuestionResource;
import com.example.rentstate.forums.domain.model.aggregates.ForumQuestion;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor
public class ResourceForumQuestionResponse {
    private Long id;
    private Long authorId;
    private String question;

    public ResourceForumQuestionResponse(ForumQuestion forumQuestion) {
        this.id = forumQuestion.getId();
        this.authorId=forumQuestion.getAuthorId();
        this.question=forumQuestion.getQuestion();


    }
}