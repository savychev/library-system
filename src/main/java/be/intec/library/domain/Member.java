package be.intec.library.domain;

public class Member {
    private Integer age;
    private String contact;
    private String membershipNumber;
    private String name;

    public Member() { }

    public Member(Integer age, String contact, String membershipNumber, String name) {
        this.age = age;
        this.contact = contact;
        this.membershipNumber = membershipNumber;
        this.name = name;
    }

    public Integer getAge() { return age; }
    public void setAge(Integer age) { this.age = age; }

    public String getContact() { return contact; }
    public void setContact(String contact) { this.contact = contact; }

    public String getMembershipNumber() { return membershipNumber; }
    public void setMembershipNumber(String membershipNumber) { this.membershipNumber = membershipNumber; }

    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
}
