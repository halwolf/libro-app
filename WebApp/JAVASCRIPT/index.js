function loadInformation(data) {
  console.log(data);
  if (data) {
    if (data.status === "SUCCESS") {
      var jsonString = JSON.stringify(data.libros);
      var oTblReport = $("#example");

      oTblReport.DataTable({
        data: data.libros,
        columns: [
          { "data": "titulo" },
          { "data": "anio" },
          { "data": "editorial" },
          { "data": "autor" },
        ]
      });
    } else {
      alert("No hay data");
    }
  }
}

$(document).ready(function () {
  $.ajax({
    url: "http://127.0.0.1:8080/libro",
    async: true,
    type: "GET",
  }).done(function (data) {
    handleData(data);
  });
});

function handleData(data) {
  loadInformation(data);
}
