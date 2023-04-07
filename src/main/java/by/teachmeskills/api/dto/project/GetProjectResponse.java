package by.teachmeskills.api.dto.project;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class GetProjectResponse {
    public boolean status;
    public Result result;
}