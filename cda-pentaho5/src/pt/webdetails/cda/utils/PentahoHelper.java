package pt.webdetails.cda.utils;

import pt.webdetails.cpf.session.PentahoSession;
import org.pentaho.platform.api.engine.IPentahoSession;

public class PentahoHelper {

  public static boolean isAdmin( IPentahoSession session ) {
    return new PentahoSession( session ).isAdministrator();
  }

}
