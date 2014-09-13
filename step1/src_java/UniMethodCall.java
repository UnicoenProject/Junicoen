import java.util.List;

public class UniMethodCall extends UniExpr {
  public UniExpr receiver;
  public String methodName;
  public List<UniExpr> args;
}
