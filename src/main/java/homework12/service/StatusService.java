package homework12.service;

import homework12.dao.StatusDao;
import homework12.dto.StatusDto;
import homework12.entities.Status;

import java.util.ArrayList;
import java.util.List;

public class StatusService {

    private final StatusDao statusDao;

    public StatusService(){
        statusDao = new StatusDao();
    }

    public List<StatusDto> findAllStatuses(){
        List<Status> statuses = statusDao.findAllStatuses();
        List<StatusDto> result = new ArrayList<>();

        for (Status status: statuses) {
            StatusDto dto = new StatusDto();
            dto.setAlias(status.getAlias());
            dto.setDescription(status.getDescription());
            result.add(dto);
        }
        return result;
    }
}
