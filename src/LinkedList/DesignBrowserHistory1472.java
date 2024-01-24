package LinkedList;

public class DesignBrowserHistory1472 {
  private static class Website {
    String url;
    Website prev;
    Website next;
    public Website() {}
    public Website(String url) {
      this.url = url;
    }
  }
  private Website homePage;
  private Website current;

  public DesignBrowserHistory1472(String homepage) {
    homePage =new Website(homepage);
    homePage.next = homePage;
    homePage.prev = homePage;
    current = homePage;
  }

  public void visit(String url) {
    Website newPage = new Website(url);
    current.next = newPage;
    newPage.prev = current;
    current = newPage;
    newPage.next = homePage;
    homePage.prev = newPage;
  }

  public String back(int steps) {
    if (current == homePage || steps == 0) {
      return current.url;
    }
    current = current.prev;
    return back(steps - 1);
  }

  public String forward(int steps) {
    if (current.next == homePage || steps == 0) {
      return current.url;
    }
    current = current.next;
    return forward(steps - 1);
  }
}
