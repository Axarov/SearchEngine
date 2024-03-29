package searchengine.services;

public interface IndexingService {
    boolean performUrlIndexing(String url);
    void indexingAll();
    boolean stopIndexing();
    void removeSiteFromIndex(String url);
}
