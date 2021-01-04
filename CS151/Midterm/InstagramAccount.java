package midterm1;

public class InstagramAccount implements Comparable<InstagramAccount> {
    String userName;
    private int numberOfPosts;
    private int numberOfFollowing;


    public InstagramAccount(String userName, int numberOfPosts, int numberOfFollowing) {
        this.userName = userName;
        this.numberOfPosts = numberOfPosts;
        this.numberOfFollowing = numberOfFollowing;
    }

    @Override
    public String toString() {
        // To nicely print each object
        // May be helpful for debugging
        return this.userName + " posts " + this.numberOfPosts + " following " + this.numberOfFollowing;
    }

    @Override
    public int compareTo(InstagramAccount other) {
        if (this.numberOfPosts < other.numberOfPosts) {
            return 1;
        } else if (this.numberOfPosts > other.numberOfPosts) {
            return -1;
        } else {
            if (this.numberOfFollowing < other.numberOfFollowing) {
                return 1;
            } else if (this.numberOfFollowing > other.numberOfFollowing) {
                return -1;
            } else {
                return 0;
            }
        }
    }

    @Override
    public boolean equals(Object obj) {
        if(obj instanceof InstagramAccount) {
            InstagramAccount other = (InstagramAccount) obj;
            return this.compareTo(other) == 0;
        }
        return false;
    }
}