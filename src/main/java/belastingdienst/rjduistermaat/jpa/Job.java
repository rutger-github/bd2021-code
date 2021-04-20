package belastingdienst.rjduistermaat.jpa;

import javax.persistence.*;
import java.util.Objects;

@Entity
@NamedQueries({
        @NamedQuery(name = "Job.findAll", query = "SELECT j FROM Job j"),
        @NamedQuery(name = "Job.find", query = "SELECT j FROM Job j WHERE j.id=:id")
})
public class Job {
    @Id
    @GeneratedValue
    private int id;
    private String title;

    public Job() {
    }

    public Job(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Job job = (Job) o;
        return id == job.id && title.equals(job.title);
    }

    @Override
    public String toString() {
        return "Job{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, title);
    }
}
