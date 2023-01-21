job("Build Idea indexes") {
  warmup(ide = Ide.Idea) {
    devfile = ".space/devfile.yaml"	
  }
}