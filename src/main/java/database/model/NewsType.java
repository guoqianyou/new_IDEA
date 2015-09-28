package database.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.List;

/**
 * @author GQY
 *         Created by GQY on 2015/9/28.
 *         新闻类型
 */
@Entity
public class NewsType implements Serializable {

    private static final long serialVersionUID = -729883939228593171L;
    private String id;
    private String typeName;
    private String typeCode;
    private List<NewsCountent> newsCountent;


    @Id
    @GeneratedValue(generator = "generator")
    @GenericGenerator(name = "generator", strategy = "uuid")
    @Column(unique = true, nullable = false)
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTypeCode() {
        return typeCode;
    }

    public void setTypeCode(String typeCode) {
        this.typeCode = typeCode;
    }

    @OneToMany(mappedBy = "newsType", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @OrderBy(value = "createDate")
    public List<NewsCountent> getNewsCountent() {
        return newsCountent;
    }

    public void setNewsCountent(List<NewsCountent> newsCountent) {
        this.newsCountent = newsCountent;
    }
}
