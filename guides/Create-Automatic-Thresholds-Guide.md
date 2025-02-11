---
title: How to Create Automatic Thresholds in Carrier
author: User
date: 2025-01-20 12:00:00 +0800
categories: [Performance, Tutorial]
tags: [performance, carrier, thresholds, configuration]
render_with_liquid: false
---

## Overview

This guide provides step-by-step instructions on how to create automatic thresholds in Carrier. Automatic thresholds help in setting performance benchmarks based on baseline tests, ensuring that your application meets the desired performance criteria.

### Prerequisites

Before you begin creating automatic thresholds in Carrier, ensure that you have completed the following:

- Installed and set up Carrier successfully.
- Created a project in Carrier.
- Configured and executed a test with a baseline available.

### Steps

Follow the steps below to create automatic thresholds in Carrier:

### Step 1: Access the Carrier Web Interface

1. Open a web browser and enter the URL of your Carrier installation.
2. Log in to the Carrier web interface using your credentials.

> Note: Make sure you have logged in using the appropriate user account that has all required accesses.
{: .prompt-info }

### Step 2: Open Project Configuration

1. From the project dropdown menu, select the desired project where you want to create automatic thresholds.
![Select Project](/assets/posts_img/select_prj.png)
2. Click "Go!" to navigate to the project's configuration page.

### Step 3: Open Tasks

1. In the project configuration page, click on the "Configuration" tab located in the left menu.
![Configuration Dropdown](/assets/posts_img/select_configuration_dropdown.png)
2. Click on the "Tasks" section.
![Tasks Section](/assets/posts_img/tasks_section.png)

### Step 4: Create New Task

1. Click on the "+" button to create a new task.
![Add Task](/assets/posts_img/add_task.png)
2. Enter the task name and description.
3. Select the task type as "Automatic Thresholds".

### Step 5: Upload Task with Parameters

1. In the task creation form, upload the task script or configuration file with the necessary parameters.
2. Ensure that the parameters include the baseline test details and the criteria for setting thresholds.
![Upload Task](/assets/posts_img/upload_task.png)

### Step 6: Run Task

1. After uploading the task, click the "Save" button to save the task configuration.
2. Navigate back to the "Tasks" section and select the newly created task.
3. Click the "Run" button to execute the task.
![Run Task](/assets/posts_img/run_task.png)

### Step 7: Verify Thresholds

1. Once the task is executed, navigate to the "Performance" tab in the project configuration page.
2. Check the thresholds set for various performance metrics based on the baseline test.
![Verify Thresholds](/assets/posts_img/verify_thresholds.png)

By following these steps, you can create automatic thresholds in Carrier, ensuring that your application meets the desired performance benchmarks.

### References

- [Carrier Documentation](https://getcarrier.io/docs)
- [Carrier Support](https://getcarrier.io/support)

### Conclusion

Creating automatic thresholds in Carrier helps in maintaining consistent performance standards for your application. By leveraging baseline tests, you can set benchmarks that ensure your application performs optimally under various conditions.