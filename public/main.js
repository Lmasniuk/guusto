angular.module('demo', [])
.controller('Merchants', function($scope, $http) {
    $http.get('http://localhost:8080/merchants').
        then(function(response) {
            $scope.merchants = response.data;
        });
});


function countryVisibility() {
    var countryFilter = "";
    if (document.getElementById('canada').checked){
        countryFilter = 'Canada';
    } else if (document.getElementById('usa').checked) {
        countryFilter = 'USA';
    } else if (document.getElementById('all-countries').checked) {
        countryFilter = 'all';
    }

    $('.merchant-listing').each(function(){
        var merchantCountry = $(this).find("td:eq(1)").text();
        if(countryFilter == "all") {
            $(this).css("display", "block");
        } else if(merchantCountry == countryFilter){
            $(this).css("display", "block");
        } else {
            $(this).css("display", "none");
        }
     });
}