---
title: Configuring Locust Test in Carrier
author: User
date: 2025-01-13 12:00:00 +0300
categories: [Performance, Tutorial]
tags: [performance, carrier, locust, configuration]
render_with_liquid: false
---

## Overview

This guide provides step-by-step instructions for configuring a Locust test in Carrier. Locust is an open-source load testing tool that allows you to define user behavior and simulate multiple users interacting with your application.

### Prerequisites

Before you begin configuring a Locust test in Carrier, ensure that you have completed the following:

- Installed and set up Carrier successfully.
- Created a project in Carrier.
- Configured Backend test.

> Note: You can find out how to create a project in Carrier in the following [guide](https://getcarrier.io/posts/carrier-create-project/)
{: .prompt-info }

### Steps

Follow the steps below to configure a Locust test in Carrier:

### Step 1: Access the Carrier Web Interface

1. Open a web browser and enter the URL of your Carrier installation.
2. Log in to the Carrier web interface using your credentials.

> Note: Make sure you have logged in using the appropriate user account that has all required accesses
{: .prompt-info }

### Step 2: Select the Project

1. From the project dropdown menu, select the desired project where you want to configure the Locust test.
![Select Project](/assets/posts_img/select_prj.png)
2. Click "Go!" to navigate to the project's configuration page.

### Step 3: Navigate to the Backend Tests Tab

1. In the project configuration page, click on the "Performance" tab located in the left menu.
![Performance Dropdown](/assets/posts_img/performance_dropdown.png)
2. Click on the "Backend" tab to define and manage your Backend tests.
![Backend Page](/assets/posts_img/backend_page.png)

### Step 4: Configure Locust Test

1. Click on the plus button on the Backend page to add a new test.
![Add Backend Test](/assets/posts_img/add_backend_test.png)

2. Fill in the following fields:
   - **Test Name**: Enter a name for your Locust test.
   - **Test Type**: Select "Locust" from the dropdown menu.
   - **Test Environment**: Select the environment where the test will be executed.
![Configure Locust Test](/assets/posts_img/configure_locust_test.png)

3. Click **Add Tests** button to save the configuration.

### Step 5: Edit Locust Test Parameters

1. You can edit the load configuration and test parameters by pressing the button to the left of the test name.
![Edit Test Parameters](/assets/posts_img/edit_test_parameters.png)

2. In the following example, we added test parameter VUSERS and set it to 5. Also, don't forget to click the **Save** button to save the test configuration.
![Change Test Parameters](/assets/posts_img/change_test_parameters.png)

### Step 6: Execute Locust Test

1. To execute your Locust test, click on the triangle button on the Backend page.
![Execute Locust Test](/assets/posts_img/execute_locust_test.png)

2. You could also change your test configuration before the test run. If all parameters are correct, just click the **Run** button.
![Test Configuration Before Run](/assets/posts_img/test_configuration_before_run.png)

3. The test execution status will appear in the Reports section.
![Test Status](/assets/posts_img/test_status.png)

### Step 7: View Test Results

1. To open test results, just click on the result name.
![Test Results Name](/assets/posts_img/test_results_name.png)

2. In the opened page, you could open each test result detail.
![Test Results Details](/assets/posts_img/test_results_details.png)

3. There are 4 charts below: **Avg. throughput**, **Error rate**, **Response time**, and **Page speed**. You could select **tests** for them, **backend aggregation**, and **UI metric** from a top dropdown. Also, you could choose between **categorical** and **time** variations for graphs and **zoom** each of them using the magnifying glass button.
![Test Results Graphs](/assets/posts_img/test_results_graphs.png)
Zoom