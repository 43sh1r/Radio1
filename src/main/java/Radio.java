public class Radio {
    private int station;
    private int volume;

    public int getStation() {
        return station;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        station = newStation;

    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int newVolume) {
        if (newVolume < 0) {
            return;
        }
        if (newVolume > 10) {
            return;
        }
        volume = newVolume;
    }


    public void next() {
        if (station < 9) {
            station++;
        } else {
            station = 0;
        }
    }

    public void prev() {
        if (station > 0) {
            station--;
        } else {
            station = 9;
        }
    }

    public void up() {
        if (volume < 10) {
            volume++;
        } else {
            return;
        }
    }

    public void down() {
        if (volume > 0) {
            volume--;
        } else {
            return;
        }
    }

}
