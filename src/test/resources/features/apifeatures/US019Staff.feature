Feature: test api staff data
  @Api
  @GetApiStaffs
  Scenario: Staff api GET request
    Given admin staff icin get request yapar
    And admin gelen Staff datasini deserialize eder
    Then admin staff datasini validate eder