
package tda_pilas;

public class URL {
    
    private String url;

    public URL(String url) {
        this.url = url;
    }

    public String getUrl() { return url; }

    public void setUrl(String url) { this.url = url; }
    
    @Override
    public String toString() {
        return url;
    }
} // fin clase URL
