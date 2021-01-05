Vagrant.configure("2") do |config|
  config.vm.box = "hashicorp/bionic64"
  
  config.vm.network "forwarded_port", guest: 8081, host: 8081
  config.vm.network "forwarded_port", guest: 81, host: 81
  config.vm.provision "file", source: "nginxApp", destination: "nginxApp"
  config.vm.provision "file", source: "nginxLoadBalancer", destination: "nginxLoadBalancer"
  config.vm.provision "file", source: "webapp", destination: "webapp"
  config.vm.provision "file", source: "docker-compose.yml", destination: "docker-compose.yml"
  config.vm.provision :shell, path: "dokerskripta.sh"

end