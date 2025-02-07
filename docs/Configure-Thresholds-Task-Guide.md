---
title: How to Configure Thresholds Task in Carrier
author: User
date: 2025-01-20 12:00:00 +0800
categories: [Performance, Tutorial]
tags: [performance, carrier, thresholds, configuration]
render_with_liquid: false
---

## Overview

This guide provides step-by-step instructions on how to configure the Thresholds Task in Carrier. Thresholds help you set performance benchmarks and ensure your tests meet the desired criteria.

### Prerequisites

Before you begin configuring the Thresholds Task in Carrier, ensure that you have completed the following:

- Installed and set up Carrier successfully.
- Created a project in Carrier.
- Configured backend or UI tests.

### Steps

Follow the steps below to configure the Thresholds Task in Carrier:

### Step 1: Download Thresholds Zip Archive from Carrier Git

1. Visit the Carrier Git repository.
2. Download the Thresholds zip archive to your local machine.

### Step 2: Navigate to Configuration -> Tasks

1. Open a web browser and enter the URL of your Carrier installation.
2. Log in to the Carrier web interface using your credentials.
3. From the project dropdown menu, select the desired project.
4. Click "Go!" to navigate to the project's configuration page.
5. Select the "Configuration" option from the top left dropdown menu.
6. Click on the "Tasks" section in the top menu.
![Tasks Section](/assets/posts_img/tasks_section.png)

### Step 3: Upload Downloaded Zip Archive

1. In the Tasks section, click on the "Upload" button.
2. Select the downloaded Thresholds zip archive from your local machine and upload it.
![Upload Zip Archive](/assets/posts_img/upload_zip_archive.png)

### Step 4: Add Parameters

1. After uploading the zip archive, you will need to add the necessary parameters.
2. Enter the following parameters:
   - **Test Name**: The name of the test for which you want to set thresholds.
   - **Type**: The type of threshold (e.g., response time, error rate).
   - **Threshold**: The value of the threshold.
![Add Parameters](/assets/posts_img/add_parameters.png)

### Step 5: Run the Thresholds Task

1. Once you have added the parameters, click on the "Run" button to execute the Thresholds Task.
![Run Task](/assets/posts_img/run_task.png)

### Step 6: Check Newly Created Thresholds in Carrier Test Planner

1. Navigate to the Test Planner section in Carrier.
2. Check the newly created thresholds to ensure they have been configured correctly.
![Check Thresholds](/assets/posts_img/check_thresholds.png)

By following these steps, you can successfully configure the Thresholds Task in Carrier and set performance benchmarks for your tests.