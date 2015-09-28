package database.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * @author GQY
 *         Created by GQY on 2015/9/28.
 *         新闻内容
 */
@Entity
public class NewsCountent implements Serializable {
    private static final long serialVersionUID = 6237675458797211777L;
    private String id;
    private String title;
    private String auther;
    private Date createDate=new Date();
    private String countent;
    private NewsType newsType;

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

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }
    @Column(nullable = false,updatable = false)
    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Column(length = 60000)
    public String getCountent() {
        return countent;
    }

    public void setCountent(String countent) {
        this.countent = countent;
    }
    @ManyToOne(cascade =CascadeType.REFRESH,optional = false)
    @JoinColumn(name = "newsTypeId")
    public NewsType getNewsType() {
        return newsType;
    }

    public void setNewsType(NewsType newsType) {
        this.newsType = newsType;
    }
}
