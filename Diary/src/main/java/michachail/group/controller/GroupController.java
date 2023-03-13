package michachail.group.controller;

import michachail.group.dto.GroupDto;
import michachail.group.service.GroupService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/group")
@RequiredArgsConstructor
@Slf4j
public class GroupController {
    private final GroupService groupService;
    @GetMapping
    public List<GroupDto>findAll(){
        return groupService.findAll();
    }
    @GetMapping("/{groupId}")
    public GroupDto findGroupById(@PathVariable long groupId){
        return groupService.findGroupById(groupId);
    }
    @PostMapping
    public GroupDto create(@RequestBody GroupDto groupDto){
    return groupService.create(groupDto);
    }
}
