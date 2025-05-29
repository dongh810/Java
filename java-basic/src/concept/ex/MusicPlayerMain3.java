package concept.ex;

public class MusicPlayerMain3 {

    public static void main(String[] args) {
        MusicPlayerData data = new MusicPlayerData();
        on(data);
        volumeUp(data);
        volumeUp(data);
        volumeUp(data);
        showStatus(data);
    }

    static void on(MusicPlayerData data) {
        data.isOn = true;
        System.out.println("음악 플레이어를 시작");
    }

    static void off(MusicPlayerData data) {
        data.isOn = false;
        System.out.println("음악 플레이어를 종료");
    }

    static void volumeUp(MusicPlayerData data) {
        data.volumn++;
        System.out.println("음악 플레이어 볼륨:" + data.volumn);
    }

    static void volumeDown(MusicPlayerData data) {
        data.volumn--;
        System.out.println("음악 플레이어 볼륨:" + data.volumn);
    }

    static void showStatus(MusicPlayerData data) {
        System.out.println("음악 플레이어 상태 확인");
        if (data.isOn) {
            System.out.println("음악 플레이어 ON, 볼륨:" + data.volumn);
        } else {
            System.out.println("음악 플레이어 OFF, 볼륨:" + data.volumn);
        }
    }
}
