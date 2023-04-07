package by.teachmeskills.api.dto.project;

import lombok.AccessLevel;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@AllArgsConstructor(access = AccessLevel.PRIVATE)
public class Counts {
    public int cases;
    public int suites;
    public int milestones;
    public Runs runs;
    public Defects defects;
}
