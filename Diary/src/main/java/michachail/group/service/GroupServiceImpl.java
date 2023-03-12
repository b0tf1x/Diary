package michachail.group.service;

import michachail.exceptions.NotFoundException;
import michachail.group.dto.GroupDto;
import michachail.group.mapper.GroupMapper;
import michachail.group.storage.GroupRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import michachail.group.model.Group;

import java.util.List;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor(onConstructor_ = @Autowired)
public class GroupServiceImpl implements GroupService {
    private final GroupRepository groupRepository;

    @Override
    public List<GroupDto> findAll() {
        return groupRepository.findAll()
                .stream()
                .map(GroupMapper::toGroupDto)
                .collect(Collectors.toList());
    }

    @Override
    public GroupDto findGroupById(long groupId) {
        Group group = groupRepository.findById(groupId).orElseThrow(() -> {
            throw new NotFoundException("Группа не найдена");
        });
        return GroupMapper.toGroupDto(group);
    }
    @Override
    public GroupDto create(GroupDto groupDto){
        Group group = groupRepository.save(GroupMapper.toGroup(groupDto));
        return GroupMapper.toGroupDto(group);
    }
}
