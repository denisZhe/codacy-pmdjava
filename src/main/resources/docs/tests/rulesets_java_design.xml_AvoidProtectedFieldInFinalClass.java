//#Patterns: design_AvoidProtectedFieldInFinalClass


public final class Bar {
  private int x;

  //#Err: design_AvoidProtectedFieldInFinalClass
  protected int y;  // bar cannot be subclassed, so is y really private or package visible?
  Bar() {}
}
