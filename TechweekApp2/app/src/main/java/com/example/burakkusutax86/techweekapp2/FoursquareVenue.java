package com.example.burakkusutax86.techweekapp2;

/**
 * Created by burakkusutax86 on 6/21/15.
 */
public class FoursquareVenue
{
    private String	name;
    private String	city;
    private String	iconUrl;

    private String	category;

    public FoursquareVenue()
    {
        this.name = "";
        this.city = "";
        this.iconUrl = "";
        this.setCategory("");
    }

    public String getCity()
    {
        if (city.length() > 0)
        {
            return city;
        }
        return city;
    }

    public void setCity(String city)
    {
        if (city != null)
        {
            this.city = city.replaceAll("\\(", "").replaceAll("\\)", "");
            ;
        }
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
        return name;
    }

    public String getCategory()
    {
        return category;
    }

    public void setCategory(String category)
    {
        this.category = category;
    }

    public String getIconUrl()
    {
        return iconUrl;
    }

    public void setIconUrl(String url)
    {
        this.iconUrl = url;
    }

}
