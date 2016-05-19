angular.module('TIYAngularApp', [])
   .controller('SampleController', function($scope, $http) {

        $scope.getGames = function() {
            console.log("About to go get me some data!");
            $scope.name = "Bronto Cockswell";

            $http.get("/games.json")
                .then(
                    function successCallback(response) {
                        console.log(response.data);
                        console.log("Adding data to scope");
                        $scope.games = response.data;
                    },
                    function errorCallback(response) {
                        console.log("Unable to get data");
                    });
//        };
//
//       $scope.getUsers = function() {
//            console.log("About to go get me some user data!");
//            $scope.name = "Bronto Cockswell";

            $http.get("/users.json")
                .then(
                    function successCallback(response) {
                        console.log(response.data);
                        console.log("Adding data to scope");
                        $scope.users = response.data;
                    },
                    function errorCallback(response) {
                        console.log("Unable to get data");
                    });
        };

    console.log("SampleController ...");
    $scope.name = "Bronto Cockswell";

        $scope.newGame = {};
    });