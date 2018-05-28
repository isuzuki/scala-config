package io.github.isuzuki

import org.scalatest.{Matchers, WordSpec}

class ConfigTest extends WordSpec with Matchers {
  "Config" can {
    "return admin values" in {
      config.admin.user shouldBe "test_admin_user"
      config.admin.pass shouldBe "test_admin_pass"
    }

    "return database values" in {
      config.database.user shouldBe "test_app_database_user"
      config.database.pass shouldBe "test_app_database_pass"
    }

    "return external values" in {
      config.external.api.key shouldBe "test_api_key"
    }
  }
}
