package entity;

import java.math.BigDecimal;

public class transaction
{
    private int        id;
    private String     src;
    private BigDecimal usd;
    private int        due;
    private boolean    type;
    private String     category;

    public transaction(int id, String src, BigDecimal usd, int due, boolean type, String category)
    {
        this.id = id;
        this.src = src;
        this.usd = usd;
        this.due = due;
        this.type = type;
        this.category = category;
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getSrc()
    {
        return src;
    }

    public void setSrc(String src)
    {
        this.src = src;
    }

    public BigDecimal getUsd()
    {
        return usd;
    }

    public void setUsd(BigDecimal usd)
    {
        this.usd = usd;
    }

    public int getDue()
    {
        return due;
    }

    public void setDue(int due)
    {
        this.due = due;
    }

    public boolean isType()
    {
        return type;
    }

    public void setType(boolean type)
    {
        this.type = type;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    @Override
    public String toString()
    {
        return "transaction{" +
                "id=" + id +
                ", src='" + src + '\'' +
                ", usd=" + usd +
                ", due=" + due +
                ", type=" + type +
                ", category='" + category + '\'' +
                '}';
    }
}

