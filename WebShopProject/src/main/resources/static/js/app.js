/**
 * 
 */


var app= angular.module("MyApp",[]);
app.controller("ProductController", function($scope,$http){

	$scope.product = null;
	
	$scope.zoeken = function(){	
	
		$http.get("http://localhost:8080/listProduct").success(function(data){
		
		$scope.product = data;
		
	})
	
	.error(function(err){
		
		console.log(err);
		
	})
	
	
	}
	
	
});
	
	
