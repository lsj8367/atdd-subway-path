package atdd.station.service;

import atdd.station.dao.StationRepository;
import atdd.station.domain.Station;
import java.util.List;
import org.springframework.stereotype.Service;

@Service
public class StationService {

    private final StationRepository stationRepository;

    public StationService(StationRepository stationRepository) {
        this.stationRepository = stationRepository;
    }

    public Station create(final Station station) {
        return stationRepository.save(station);
    }

    public Station getById(long id) {
        return stationRepository.findById(id)
            .orElseThrow(() -> new IllegalArgumentException());
    }

    public List<Station> getAll() {
        return stationRepository.findAll();
    }

    public void deleteById(long id) {
        stationRepository.findById(id)
            .ifPresent(stationRepository::delete);
    }
}