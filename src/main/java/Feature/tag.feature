Feature: tagging test feature

@SmokeTesting
Scenario: testing1
Given smoke testing

@SanityTesting
Scenario: testing2
Given sanity testing

@SmokeTesting @RegressionTesting
Scenario: testing3
Given end to end testing

@SmokeTesting
Scenario: testing4
Given db testing

@SanityTesting
Scenario: testing5
Given user testing