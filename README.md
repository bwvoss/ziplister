## TODO List
- Setup google home dialogue interactions; interaction layer
- Local dev container setup; Run in Memory locally with a task configurations directory
- Kube local
- Setup deploys to google cloud/GH actions?
- Persistence (relational db) 
- Rewrite simple static list workflow to use relational db
- Write metrics/impact layer
- Implement complex/dynamic actions layer
- Find best practice gradle plugins for static code analysis, cve scanning, etc

# Architectural Layers
1. Interaction Layer: Google Home
2. Checklist Metrics/Impact Layer: Doesn't know about the workflow logic, just an API to understand effectiveness of specific workflows
3. Checklist Workflow Layer: doesn't know anything about overall metrics or item logic, just processing API
4. Action Item Layer: Doesn't know about how to be processed, just how items are constructed statically and dynamically and fed to workflow layer

## Current focus: Workflow layer
- using a single array for action items with no actual programming interface, but will get introduced when action item use cases are.
- 