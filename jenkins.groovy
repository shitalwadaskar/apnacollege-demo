// Jenkinsfile (Scripted Pipeline)

node {
    // Define variables
    def project = "DemoProject"
    def buildNumber = env.BUILD_NUMBER
    def workspaceDir = pwd()

    stage('Preparation') {
        echo "Preparing build for ${project}"
        echo "Workspace directory: ${workspaceDir}"
    }

    stage('Checkout') {
        echo "Checking out source code..."
        // Example Git checkout (commented out)
        // git url: 'https://github.com/your-repo.git', branch: 'main'
    }

    stage('Build') {
        echo "Building ${project} (Build #${buildNumber})"
        // Simulate a build step
        sh 'echo "Compiling code..."'
    }

    stage('Test') {
        echo "Running tests for ${project}"
        // Simulate a test step
        sh 'echo "Running unit tests..."'
    }

    stage('Deploy') {
        echo "Deploying ${project}"
        // Simulate a deployment step
        sh 'echo "Deploying application..."'
    }

    stage('Cleanup') {
        echo "Cleaning up workspace"
        cleanWs()
    }
}
