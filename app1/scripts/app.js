var app= angular.module('Registrations',[]);

app.controller('HostelListController', function($scope){
    $scope.newGender = function(value) {
       console.log(value);
    }
    this.hostels= [{name: "Alakananda",type: "Male",num:"1",},{name: "Brahmaputra",type: "Male",num:"2",},{name: "Cauvery",type: "Male",num:"3",},{name: "Ganga",type: "Male",num:"4",},{name: "Godavari",type: "Male",num:"5",},{name: "Jamuna",type: "Male",num:"6",},{name: "Krishna",type: "Male",num:"7",},{name: "Mahanadhi",type: "Male",num:"8",},{name: "Mandakini",type: "Male",num:"9",},{name: "Narmada",type: "Male",num:"10",},{name: "Pampa",type: "Male",num:"11",},{name: "Saraswathi",type: "Male",num:"11",},{name: "Sarayu",type: "Female",num:"12",},{name: "Sharavati",type: "Female",num:"12",},{name: "Sindhu",type: "Male",num:"14",},{name: "Tamraparani",type: "Male",},{name: "Tapti",type: "Male",},{name: "Sabarmati",type: "Female",},{name: "Bhatra",type: "Male",},{name: "Tunga",type: "Female",}
    ];
});





