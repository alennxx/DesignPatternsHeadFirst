package proxy.dynamic;

public class PersonComponentImpl implements PersonComponent {

    private String name;
    private String gender;
    private String hobby;
    private int beautyRank;
    private int numberOfRatings = 0;

    public PersonComponentImpl(String name, String gender, String hobby) {
        this.name = name;
        this.gender = gender;
        this.hobby = hobby;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getGender() {
        return gender;
    }

    @Override
    public void setGender(String gender) {
        this.gender = gender;
    }

    @Override
    public String getHobby() {
        return hobby;
    }

    @Override
    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public int getBeautyRank() {
        return numberOfRatings == 0 ? 0 : beautyRank / numberOfRatings;
    }

    @Override
    public void setBeautyRank(int beautyRank) {
        this.beautyRank += beautyRank;
        numberOfRatings++;
    }
}
