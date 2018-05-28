package io.github.isuzuki

import org.scalatest.{Matchers, WordSpec}

class PureConfigTest extends WordSpec with Matchers {
  "PureConfig" can {
    "pconfig return values" in {
      PureConfig.pconfig shouldBe 'right
      PureConfig.pconfig.right.get.pure.user shouldBe "pure_test_user"
      PureConfig.pconfig.right.get.pure.pass shouldBe "pure_test_pass"
    }
  }
}
