package bootstrap.liftweb

import net.liftweb.http.LiftRules
import net.liftweb.sitemap.{SiteMap, Loc, Menu}

/**
 *
 * @author Artem
 */
class Boot {
   def boot {
      LiftRules.addToPackages("org.yozh")

      val entries = Menu(Loc("Home", List("index"), "Home")) :: Nil

      LiftRules.setSiteMap(SiteMap(entries:_*))
   }
}