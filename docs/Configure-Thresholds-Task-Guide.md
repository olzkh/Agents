---
title: How to Configure Thresholds Task in Carrier
author: User
date: 2025-01-20 12:00:00 +0800
categories: [Performance, Tutorial]
tags: [performance, carrier, thresholds, configuration]
render_with_liquid: false
---

## Overview

This guide provides step-by-step instructions for configuring the Thresholds Task in Carrier. Thresholds help to set performance benchmarks for your tests, ensuring that your application meets the required performance criteria.

### Prerequisites

Before you begin configuring the Thresholds Task in Carrier, ensure that you have completed the following:

- Installed and set up Carrier successfully.
- Created a project in Carrier.
- Configured and executed backend or UI tests.

### Steps

Follow the steps below to configure the Thresholds Task in Carrier:

### Step 1: Download Thresholds Zip Archive

1. Visit the Carrier Git repository.
2. Download the Thresholds zip archive to your local machine.

### Step 2: Navigate to Configuration -> Tasks

1. Open a web browser and enter the URL of your Carrier installation.
2. Log in to the Carrier web interface using your credentials.
3. From the project dropdown menu, select the desired project where you want to configure the Thresholds Task.
4. Click "Go!" to navigate to the project's configuration page.
5. Select the CONFIGURATION option from the top left dropdown menu.
6. Click on the "Tasks" option in the top menu.
![Tasks Section](/assets/posts_img/tasks_section.png)

### Step 3: Upload the Downloaded Zip Archive

1. In the Tasks section, click on the "Upload" button.
2. Select the downloaded Thresholds zip archive from your local machine and upload it.
![Upload Task](/assets/posts_img/upload_task.png)

### Step 4: Add Parameters

1. After uploading the zip archive, you will need to add the following parameters:
   - **Test Name**: The name of the test for which you want to set thresholds.
   - **Type**: The type of threshold (e.g., response time, error rate).
   - **Threshold**: The value of the threshold.
![Add Parameters](/assets/posts_img/add_parameters.png)

### Step 5: Run the Task

1. Once you have added the parameters, click on the "Run" button to execute the Thresholds Task.
![Run Task](/assets/posts_img/run_task.png)

### Step 6: Check for Newly Created Thresholds

1. Navigate to the Carrier test planner.
2. Check for the newly created thresholds to ensure they have been configured correctly.
![Check Thresholds](/assets/posts_img/check_thresholds.png)

By following these steps, you can successfully configure the Thresholds Task in Carrier, allowing you to set performance benchmarks for your tests and ensure your application meets the required performance criteria.