I have created a repository on github and made sure it is public.
After I made the repository i pushed the files from Oblig 2 to github via intellij.
Then i pressed actions on github, where i chose "java with maven", and pushed the .yml file i got.

Added "maven-surefire-plugin" in the pom.xml file.
But i got errors while pushing to github since i had a module in the repository where the .idea and .github were not in the same module.
I fixed this by moving everything out of the module and directly into the github repository.
After this the actions tab checked the tests while pushing to github.
