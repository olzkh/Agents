---
title: How to Run AI Analysis Task in Carrier
author: User
date: 2025-01-06 12:00:00 +0800
categories: [guide]
tags: [performance, carrier, backend-test, configuration]
render_with_liquid: false
---

## Overview

This guide provides step-by-step instructions for executing an AI Analysis task in Carrier. The AI Analysis task is designed to generate performance testing reports (with key findings and observations) in Excel and PDF formats that can be sent by email.

## Prerequisites

Before you begin executing the AI Analysis task in Carrier, ensure that you have completed the following:

1. Installed and set up Carrier successfully.
2. Created a project in Carrier.
3. Configured backend tests.
4. Executed backend tests and obtained results.

## Steps

Follow the steps below to execute the AI Analysis task:

### Step 1: Access the Carrier Web Interface

1. Open a web browser and enter the URL of your Carrier installation.
2. Log in to the Carrier web interface using your credentials.

### Step 2: Select the Project

1. From the project dropdown menu, select the desired project where you want to run the AI Analysis task.
2. Click "Go!" to navigate to the project's configuration page.

### Step 3: Navigate to the Performance Section

1. In the project configuration page, click on the "Performance" tab located in the left menu.
2. This will open the Performance section where you can click the UI tab to define and manage your UI tests.

### Step 4: Open UI Test

1. Click on the test name on the Results tab.
2. In the opened test results, click on the "Run Task" button.

### Step 5: Run Task

1. In the opened menu, click on the dropdown to select a task.
2. In the opened page, you can open each test result detail.

### Step 6: Save the UI Performance Test

1. After configuring all the necessary parameters for the UI performance test, click the "Save" button to save your changes.

## Key Parameters and Configurations

### Test Parameters

- **Entrypoint**: Specify the script name to be used as the entrypoint for the test.
- **Number of loops**: Specify the number of loops or iterations for the test.
- **Aggregation**: Set the aggregation method for the test results.
- **Test Parameters**: Create additional parameters that can be changed in subsequent test runs.
- **Integrations**: Configure integrations to compare test results with SLAs using QualityGate.
- **Reporters**: Specify the reporters for test results. You can also set reporters in the Integrations section.
- **Scheduling**: Create schedules for the test with different parameters.
- **Advanced Parameters**: Configure additional parameters for the test runner, test data, and network settings.

### Performance Metrics

- **Individual Response Time > 3000 milliseconds (3 seconds)**: Every request's response time should be less than 3000 milliseconds. If it exceeds 3000 milliseconds + deviation, the build will fail.

### Baseline

- Setting baselines allows you to compare test results against a predefined performance standard. Choose the appropriate baseline for your test to assess deviations from expected performance.

## Analyzing Test Results

1. There are 4 charts below: Avg. throughput, Error rate, Response time, and Page speed. You can select tests for them, backend aggregation, and UI metric from a top dropdown.
2. You can choose between categorical and time variations for graphs and zoom each of them using the magnifying glass button.
3. Next, you can see a large graph with metrics from all tests from the Suite.
4. At the bottom of the page, there are summary tables for backend and UI test results.

## Next Steps

Once you have configured AWS integration in Carrier, you can proceed to run your performance tests leveraging AWS resources.

### Follow the steps below to execute Tasks for UI tests:

1. **Access the Carrier Web Interface**: Open a web browser and enter the URL of your Carrier installation. Log in to the Carrier web interface using your credentials.
2. **Select the Project**: From the project dropdown menu, select the desired project where you want to run the AI Analysis task. Click "Go!" to navigate to the project's configuration page.
3. **Navigate to the Performance Section**: In the project configuration page, click