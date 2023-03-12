package michachail.marks.service;

import michachail.marks.dto.MarksDto;

import java.util.List;

public interface MarksService {
    List<MarksDto> getMarksByStudentId(long studentId);
    List<MarksDto> getMarksByStudentAndGroup(String name, long group);
}
