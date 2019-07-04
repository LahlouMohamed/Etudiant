var app=angular.module("myEtdApp",[]);
app.controller("myEtdController", function($scope,$http){
	$scope.codee=null;
	$scope.etudiant={};
	$scope.groupe={};
	$scope.libelle=null;
	$scope.search=function(){
		$http.get("/Etudiants/"+$scope.codee)
		.success(function(data){
			$scope.etudiant=data;
		})
	}
	$scope.save=function(){
		
		$http({
			method 	: 'POST',
			url 	: 'Groupes',
			data	: {"libelle" :$scope.libelle},
			headers	: {'Content-Type': 'application/json'}
		})
		.success(function(data){
			$scope.groupe=data;
		})
	}
});