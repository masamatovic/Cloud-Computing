Vagrant.configure("2") do |config|
  config.vm.box = "hashicorp/bionic64"
  
  config.vm.network "forwarded_port", guest: 8081, host: 8081

  config.vm.provision "file", source: "webapp", destination: "webapp"
  config.vm.provision "file", source: "docker-compose.yml", destination: "docker-compose.yml"
  config.vm.provision :shell, path: "dokerskripta.sh"

end
