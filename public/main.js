angular.module('demo', [])
.controller('Merchants', function($scope, $http) {
    $http.get('http://localhost:8080/merchants').
        then(function(response) {
            $scope.merchants = response.data;
        });
});