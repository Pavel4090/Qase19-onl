package by.teachmeskills.api.client;

import by.teachmeskills.api.dto.project.GetProjectResponse;

import java.util.Map;

public class ProjectApiClient extends BaseApiClient {

    private static final String CODE = "code";
    private static final String PROJECT_PATH_CODE = "/v1/project/{" + CODE + "}";

    public GetProjectResponse getProject(String code) {
        return get(PROJECT_PATH_CODE, Map.of(CODE, code), GetProjectResponse.class);
    }


}
