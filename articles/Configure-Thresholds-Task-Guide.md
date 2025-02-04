---
title: How to Configure Thresholds Task in Carrier
author: User
date: 2025-01-20 12:00:00 +0800
categories: [Performance, Tutorial]
tags: [performance, carrier, thresholds, configuration]
render_with_liquid: false
---

## Overview

This guide provides step-by-step instructions on how to configure the Thresholds Task in Carrier. Thresholds help in setting performance benchmarks for your tests, ensuring that your application meets the required performance criteria.

### Prerequisites

Before you begin configuring the Thresholds Task in Carrier, ensure that you have completed the following:

- Installed and set up Carrier successfully.
- Created a project in Carrier.
- Configured and executed backend or UI tests.

### Steps

Follow the steps below to configure the Thresholds Task in Carrier:

### Step 1: Download Thresholds Zip Archive

1. Go to the Carrier Git repository and download the Thresholds zip archive.
   - You can find the repository [here](https://github.com/getcarrier/thresholds).
   - Click on the "Code" button and select "Download ZIP".
   ![Download ZIP](https://github.com/getcarrier/thresholds/raw/main/assets/download_zip.png)

### Step 2: Navigate to Configuration -> Tasks

1. Open a web browser and enter the URL of your Carrier installation.
2. Log in to the Carrier web interface using your credentials.
3. From the project dropdown menu, select the desired project where you want to configure the Thresholds Task.
   ![Select Project](/assets/posts_img/select_prj.png)
4. Click "Go!" to navigate to the project's configuration page.
5. Select CONFIGURATION option from the top left dropdown menu.
   ![Select Configuration Dropdown](/assets/posts_img/select_configuration_dropdown.png)
6. Click on "Tasks" option in the top menu.
   ![Tasks Option](/assets/posts_img/tasks_option.png)

### Step 3: Upload the Downloaded Zip Archive

1. In the Tasks section, click on the "Upload Task" button.
   ![Upload Task](/assets/posts_img/upload_task.png)
2. Select the downloaded Thresholds zip archive from your local machine and upload it.
   ![Upload Thresholds](/assets/posts_img/upload_thresholds.png)

### Step 4: Add Parameters

1. After uploading the zip archive, you will need to add the following parameters:
   - **Test Name**: The name of the test for which you want to set thresholds.
   - **Type**: The type of test (e.g., Backend, UI).
   - **Threshold**: The performance threshold value.
   ![Add Parameters](/assets/posts_img/add_parameters.png)

### Step 5: Run the Task

1. Once you have added the parameters, click on the "Run Task" button.
   ![Run Task](/assets/posts_img/run_task.png)

### Step 6: Check in Carrier Test Planner

1. Navigate to the Test Planner section in Carrier to check for the newly created thresholds.
   ![Test Planner](/assets/posts_img/test_planner.png)
2. You should see the thresholds listed under the respective test.
   ![Thresholds List](/assets/posts_img/thresholds_list.png)

By following these steps, you can successfully configure the Thresholds Task in Carrier, ensuring that your tests meet the required performance benchmarks.