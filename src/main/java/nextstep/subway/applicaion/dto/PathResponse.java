package nextstep.subway.applicaion.dto;

import java.util.List;

public class PathResponse {

    private final List<StationResponse> stations;
    private final int distance;

    public PathResponse(final List<StationResponse> stations, final int distance) {
        this.stations = stations;
        this.distance = distance;
    }

    public List<StationResponse> getStations() {
        return stations;
    }

    public int getDistance() {
        return distance;
    }

}
