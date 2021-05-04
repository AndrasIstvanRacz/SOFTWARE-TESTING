Bug Ticket - Categories gets mixed up.
===================================

**Description:** When I click on the next/previous button, the next/previous page contains other products as well.

**Environment:** Production

**Details:**
- Expected behavior: Clicking the next/previous button lists only the products of the given category. If there are no more product the next button
should become unavailable.
- Actual behavior: Clicking the next/previous button lists random products ignoring the selected category.

**Steps to reproduce:**
1. Go to https://demoblaze.com/index.html
2. Select "Monitors" in the category menu.
3. Scroll down, and click "Next" or "Previous" a couple of times.

**Severity, justification:**
Medium severity, as users can lost track while browsing products.
