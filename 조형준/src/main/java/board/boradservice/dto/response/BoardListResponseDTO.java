package board.boradservice.dto.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class BoardListResponseDTO {
    private String boardTitle;
    private String boardContext;
    private String memberEmail;
}
