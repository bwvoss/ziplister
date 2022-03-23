# Architectural Layers
1. Interaction Layer: Google Home
2. Checklist Metrics/Impact Layer: Doesn't know about the workflow logic, just an API to understand effectiveness of specific workflows
3. Checklist Workflow Layer: doesn't know anything about overall metrics or item logic, just processing API
4. Action Item Layer: Doesn't know about how to be processed, just how items are constructed statically and dynamically and fed to workflow layer

## Current focus: Workflow layer
- using a single array for action items with no actual programming interface, but will get introduced when action item use cases are.
 
# Usage Milestones
- *NOW:* use it in memory, cli
- use it with metrics (rds persistence perhaps in container), cli
- see a dashboard summary on the web, springboot, kube/container setup, github actions to google cloud
- use with google home, deploy to google cloud, springboot
- dynamic items in workflow

## Backlog
- User defines checklist as an array, runs through it in memory on CLI